# 23种设计模式的学习笔记

## 面向对象的"六原则一法则"

- **单一职责原则**：一个类只做它该做的事情。
- **开闭原则**：软件实体应当对扩展开放，对修改关闭。
- **依赖倒转原则**：面向接口编程。
- **里氏替换原则**：任何时候都可以用子类型替换掉父类型。
- **接口隔离原则**：接口要小而专，绝不能大而全。
- **合成聚合复用原则**：优先使用聚合或合成关系复用代码。
- **迪米特法则**：迪米特法则又叫最少知识原则，一个对象应当对其他对象有尽可能少的了解。

## 23种设计模式

就是一套被反复使用的代码设计经验的总结（情境中一个问题经过证实的一个解决方案）。使用设计模式是为了可重用代码、让代码更容易被他人理解、保证代码可靠性。设计模式使人们可以更加简单方便的复用成功的设计和体系结构。将已证实的技术表述成设计模式也会使新系统开发者更加容易理解其设计思路。 

- **创建型**：Abstract Factory（抽象工厂模式），Builder（建造者模式），Factory Method（工厂方法模式），Prototype（原始模型模式），Singleton（单例模式）
- **结构型**：Facade（门面模式），Adapter（适配器模式），Bridge（桥梁模式），Composite（合成模式），Decorator（装饰模式），Flyweight（享元模式），Proxy（代理模式）
- **行为型**：Command（命令模式），Interpreter（解释器模式），Visitor（访问者模式），Iterator（迭代子模式），Mediator（调停者模式），Memento（备忘录模式），Observer（观察者模式），State（状态模式），Strategy（策略模式），Template Method（模板方法模式）， Chain Of Responsibility（责任链模式）

## 常用模式举例

**工厂模式**：工厂类可以根据条件生成不同的子类实例，这些子类有一个公共的抽象父类并且实现了相同的方法，但是这些方法针对不同的数据进行了不同的操作（多态方法）。当得到子类的实例后，开发人员可以调用基类中的方法而不必考虑到底返回的是哪一个子类的实例。

**代理模式**：给一个对象提供一个代理对象，并由代理对象控制原对象的引用。实际开发中，按照使用目的的不同，代理可以分为：远程代理、虚拟代理、保护代理、Cache代理、防火墙代理、同步化代理、智能引用代理。

**适配器模式**：把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起使用的类能够一起工作。

**模板方法模式**：提供一个抽象类，将部分逻辑以具体方法或构造器的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法（多态实现），从而实现不同的业务逻辑。 

## 设计模式应用举例

- **工厂模式（简单、抽象）**：Spring IoC容器 管理 Bean
- **单例模式**：池化技术
- **建造者模式**：定义了一个新的类来构建另一个类的实例，以简化复杂对象的创建。建造模式通常也使用方法链接来实现。java.lang.StringBuilder#append()、java.sql.PreparedStatement
- **门面模式**：BaseService
- **享元模式**：缓存技术， 使用缓存来加速大量小对象的访问时间 java.lang.Integer#valueOf(int)
- **装饰模式**：Java IO
- **代理模式**: Spring AOP、RMI
- **迭代子模式**: 集合的Iterator

【未完待续】JDK源码中使用的设计模式		
