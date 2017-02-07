# AndroidCleanArchitectureWithMVP
Clean architecture in Android with MVP presentation layer.

The problem
-------
How to design a simple, decoupled, testable [clean architecture](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html) for Android, using [MVP](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter) for the presentation layer.

The solution
-------
The solution is based on the [boilerpart code for asynchronous MVP design for Android, without 3rd party libraries](https://github.com/ovicon/AndroidAsynchronousMVPBoilerpart). 

Systems based on clean arhitecture have the following characteristics: separation of concerns, multilayered, independent of frameworks, independent of user interface, independent of databases, tetsable by layer, with a dependency rule that says that code dependencies can only point inwards.  

From now on, I shall only talk about clean arhitecture, in the context of the example application:

![AndroidCleanArchitectureWithMVP](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/AndroidCleanArchitectureWithMVP_emulator-169x300.png "AndroidCleanArchitectureWithMVP")

I do encourage further reading on this topic, starting with this two excelent resources: [The Clean Architecture](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html) and [Architecting Android…The clean way?](http://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/) 

![AndroidCleanArchitectureWithMVP](http://www.ovidiuconeac.ro/wp-content/uploads/2017/02/clean_arhitecture_layers.png "AndroidCleanArchitectureWithMVP")


