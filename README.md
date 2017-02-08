# AndroidCleanArchitectureWithMVP
Clean architecture in Android with MVP presentation layer.

The problem
-------
How to design a simple, decoupled, testable [clean architecture](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html) for Android, using [MVP](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter) for the presentation layer.

The solution
-------
Systems based on clean arhitecture have the following characteristics: separation of concerns, multilayered, independent of frameworks, independent of user interfaces, independent of databases, tetsable by layer, with a dependency rule that says that code dependencies can only point inwards, from lower leves like the presentation layer, to higher levels like the data layer. 

The solution is an extension based on the [boilerpart code for asynchronous MVP design for Android, without 3rd party libraries](https://github.com/ovicon/AndroidAsynchronousMVPBoilerpart).  

From now on, I shall only talk about clean arhitecture, in the context of the example application:

![AndroidCleanArchitectureWithMVP](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/AndroidCleanArchitectureWithMVP_emulator-169x300.png "AndroidCleanArchitectureWithMVP")

The example application is based on the following 3-tier clean arhitecture: the presentation layer, the domain layer, and the data layer.
![Generic 3-tier clean architecture](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/clean_architecture_layers.png "Generic 3-tier clean architecture")

The presentation layer is implemented as an MVP design, the domain layer contains plain Java objects, and the data layer is just a dummy singelton implementaion for a database. 

You can have as many layers as needed, and there is not rule that says that clean arhitecture should be implemented with only three layers.

The presentation layer represents the application, and is an Android phone & table module. The domain layer and data layer are Java libraries, and used as gradle dependencies. The presentation layer depends of the domain layer and the domain layer depends on the data layer. There is also an extra module, named models, that contains the models of the application. For the sake of simplicity, these modules are used in all the layers of the application. In a more complex application usually each layer has its own data modeling.

![Modules in Android Studio](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/gradle_modules.png "Modules in Android Studio")

Because gradle manages dependencies between layers, the models module is only defined as a dependency in the data layer, which is used as a dependency in the domain layer, which in turn is used as a dependency in the presentation layer. In this way, the models dependency becomes availabe in all the layers. It is called transitivity, and it is how gradle handles dependencies.

To better understand the details of the 3-tier clean arhitecture with MVP, let's see another overview, but from a different perspective.

![Clean architecture layers details](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/clean_architecture_layers_onion_detail.png "Clean architecture layers details")

This is the same as the previous overview, but with more details about the presentation layer, which on its own contains three layers: the view, the presenter and the model. 

![Presentation layer](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/clean_architecture_presentation_layer.png "Presentation layer")

Following the dependency rule, the arhitecture is layered as follows: the presentation layer (the view, the presenter, the model), the domain layer and the data layer. 

The model in the presenter layer is also known as "uses cases" or "interactor". These use cases, or model, or interactor, or whatever you want to call it, represent application specific business rules. These use cases orchestrate the flow of data between the presentation layer and the domain layer, and they are specific to the application and not the domain. You can think of them, as what the application does, what the presentation layer does. Remember that the presentation layer can be anything from an android aplication, a web application, a standalone application, etc. 

The idea of clean arhitecture is to have separation of concers. In our example the presentation layer contains everything that is android related, the domain layer contains plain java objects that represent the business entities, and the data layer contains everything that is database related.

In a clean arhitecture, is should be possible to replace each layer with a different implementation of the same interfaces, and this should make n difference on the other layers.

The conclusion
-------
Having separation of concers in an application might seem like a no-brainer. Yet it is surprisingly difficult to achive. The best way to start is to understand the purpose of the clean arhitecture and just practice.

I do encourage further reading on this topic, starting with these excelent resources: [The Clean Architecture](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html), [Architecting Android…The clean way?](http://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/), [Robert C Martin - Clean Architecture and Design](https://www.youtube.com/watch?v=Nsjsiz2A9mg&t=9s).
