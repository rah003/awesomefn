Awesome Templating Functions
=======================

A [module](https://documentation.magnolia-cms.com/display/DOCS/Modules) for the [Magnolia CMS](http://www.magnolia-cms.com) demosntrating nearly simplest possible creation of templating functions for MAgnolia CMS.

Module will register new templating function class that one can then register with the renderer e.g. under ```/modules/rendering/renderers/freemarker/contextAttributes``` as

```
awesomefn
  componentClass=com.neatresults.awesomefn.AwesomeTemplatingFunctions
  name=awesomefn
```

The above registration is done automatically for freemarker renderer and is meant only as example for other type of renderers one might be using.

Once registered, it is possible to use functions in templates as follows:

```awesomefn.nice(text) ```

will print ```text is nice!```

similarly, functions

```awesomefn.superNice(text) ```
```awesomefn.awesome(text) ```

will return ```'text' is super nice!``` or ```'text' is awesome!``` respectively.

Last provided function is:

```awesomefn.awesome() ```

and it will print one of 10 messages in the messsages.properties file provided with the module at random.

The whole purpose of the module is just to demonstrate how to create and register templating functions and how to enable i18n in said function class. For successful enablement of class to work as templating functions it is necessary that the class has either public no-arg constructor or one annotated with @Inject annotation and all required parameters are resolvable at runtime. 
Class should not attempt to store any state, in our example to avoid having to reinitialize ```SimpleTranslator``` for every call, but to keep it stateless at the same time, we use custom locale resolver reading current locale transitively from current aggregation state.
All messages provided by module are in English, to demonstrate i18n capabilities, some are also available in german so after installing on top of default Magnolia demo, one can easily test how it works.

License
-------

Released under the GPLv3, see LICENSE.txt.

Feel free to use this app, but if you modify the source code please fork us on Github.

Maven dependency
-----------------
```xml
    <dependency>
      <groupId>com.neatresults.awesomefn</groupId>
      <artifactId>awesomefn</artifactId>
      <version>1.0</version>
    </dependency>
```

Versions
-----------------
Version 1.0.x should be compatible with all Magnolia 5.x versions, but was tested only on 5.4.3 and not before. If you run into any issues w/ older versions, please report them back.

Latest version can be found at https://nexus.magnolia-cms.com/service/local/repositories/magnolia.forge.releases/content/com/neatresults/awesomefn/1.0/awesomefn-1.0.jar

Installation & updates
-----------------
Upon instalation, module will register templating functions class and expose it under name awesomefn under freemarker renderer. To run, module requires Java 8.


Changes
-----------------
1.0
- demo functions.
