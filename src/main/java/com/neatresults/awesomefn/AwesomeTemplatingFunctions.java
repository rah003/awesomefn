/**
 *
 * Copyright 2015 by Jan Haderka <jan.haderka@neatresults.com>
 *
 * This file is part of neat-tweaks module.
 *
 * Neat-tweaks is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * Neat-tweaks is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with neat-tweaks.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @license GPL-3.0 <http://www.gnu.org/licenses/gpl.txt>
 *
 * Should you require distribution under alternative license in order to
 * use neat-tweaks commercially, please contact owner at the address above.
 *
 */
package com.neatresults.awesomefn;

import info.magnolia.context.MgnlContext;
import info.magnolia.i18nsystem.LocaleProvider;
import info.magnolia.i18nsystem.SimpleTranslator;
import info.magnolia.objectfactory.Components;

import java.util.Locale;

/**
 * Example of Templating Functions.
 */
public class AwesomeTemplatingFunctions {

    private SimpleTranslator translator;

    public AwesomeTemplatingFunctions() {
        translator = Components.newInstance(SimpleTranslator.class, new LocaleProvider() {

            @Override
            public Locale getLocale() {
                return MgnlContext.getAggregationState().getLocale();
            }
        });
    }

    public String awesome() {
        long num = Math.round(Math.random() * 10d) % 10;
        return translator.translate("awesome" + num);
    }

    public String awesome(String awesome) {
        return translator.translate("isawesome", awesome);
    }

    public String nice(String text) {
        return translator.translate("nice", text);
    }

    public String superNice(String text) {
        return translator.translate("supernice", text);
    }
}
