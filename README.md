# Java 设计模式

## 1. 介绍

设计模式是程序员在设计应用程序或系统时可以用来解决常见问题的最佳形式化实践。

设计模式可以通过提供经过测试的，经过验证的开发范例来加快开发过程。

重用设计模式有助于防止引起重大问题的细微问题，并且还可以提高熟悉模式的编码人员和架构师的代码可读性。

## 2. 分类

设计模式共有 23 种设计模式，分为三大类：创建型模式（Creative Patterns）、结构型模式（Structural Patterns）、行为型模式（Behavioral Patterns）。

1. 创建型模式
   - [x] [单例模式](https://junmoyu.com/2021/design-patterns-singleton/)
   - [ ] 工厂模式
   - [ ] 抽象工厂模式
   - [ ] 建造者模式
   - [ ] 原型模式

2. 结构型模式
   - [ ] 适配器模式
   - [ ] 桥接模式
   - [ ] 装饰器模式
   - [ ] 组合模式
   - [ ] 外观模式
   - [ ] 享元模式
   - [ ] 代理模式

3. 行为型模式
   - [ ] 模版方法模式
   - [ ] 命令模式
   - [ ] 迭代器模式
   - [ ] 观察者模式
   - [ ] 中介者模式
   - [ ] 备忘录模式
   - [ ] 解释器模式
   - [ ] 状态模式
   - [ ] 策略模式
   - [ ] 职责链模式
   - [ ] 访问者模式

## 3. 六大原则

### 3.1 单一职责原则(SRP - Single Responsibility Principle)

> 定义：一个类应该有且仅有一个引起它变化的原因，否则类应该被拆分。
> 
> 通俗来说，即一个类只负责一项职责。

单一职责原则的核心就是控制类的粒度大小、将对象解耦、提高其内聚性。如果遵循单一职责原则将有以下优点：

1. **复杂度降低**：一个类只负责一项职责，其逻辑肯定要比负责多项职责简单得多。
2. **可读性提高**：复杂性降低，自然其可读性就会提高。
3. **可维护性提高**：可读性提高，那自然更容易维护了。
4. **变更引起的风险降低**：变更是必然的，如果单一职责原则遵守得好，当修改一个功能时，可以显著降低对其他功能的影响。

### 3.2 开放封闭原则(OCP - Open Closed Principle)

> 定义：一个软件实体如模块、类与接口、方法等应该**对扩展开放，对修改关闭**。

* **对扩展开放**：意味着有新的需求或变化时，可以对现有代码进行扩展，以适应新的情况。
* **对修改封闭**：意味着类一旦设计完成，就可以独立完成其工作，而不要对类进行任何修改。

**抽象约束、封装变化** 是实现开放封闭原则的重要手段，对于经常发生变化的状态一般将其封装为一个抽象。

开放封闭原则的作用如下：

1. 可以提高软件测试的便利：只需对扩展的代码进行测试即可。
2. 可以提高代码的可复用性：粒度越小，被复用的可能性越大，在面向对象编程中，抽象编程可以提高代码复用性。
3. 可以提高软件的可维护性：遵循开放封闭原则的代码，稳定性高，延续性强，从而易于扩展和维护。

### 3.3 里氏替换原则(LSP - Liskov Substitution Principle)

> 定义：继承必须确保超类所拥有的性质在子类中仍然成立。
> 
> 通俗来说，子类可以扩展父类的功能，但不能改变父类原有的功能。

对它具体的定义可总结如下：

1. 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
2. 子类中可以增加自己特有的方法。
3. 当子类的方法重载父类的方法时，方法的前置条件（即方法的输入参数）要比父类方法的输入参数更宽松。
4. 当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格或相等。

里氏替换原则的主要作用如下：

1. 里氏替换原则是实现开闭原则的重要方式之一。
2. 它克服了继承中重写父类造成的可复用性变差的缺点。
3. 它是动作正确性的保证。即类的扩展不会给已有的系统引入新的错误，降低了代码出错的可能性。
4. 加强程序的健壮性，同时变更时可以做到非常好的兼容性，提高程序的维护性、可扩展性，降低需求变更时引入的风险。

### 3.4 最少知识原则(LKP - Least Knowledge Principle)

最少知识原则又叫**迪米特法则**。

> 定义：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。
> 
> 通俗来说，就是不要跟“陌生人”说话。
> 
> 核心思想是 **低耦合、高内聚**

正确使用最少知识原则有以下优点：

1. 降低了类之间的耦合度，提高了模块的相对独立性。
2. 由于耦合度降低，从而提高了类的可复用率和系统的扩展性。

但是，过度使用最少知识原则会使系统产生大量的中介类，从而增加系统的复杂性，使模块之间的通信效率降低。所以，在釆用迪米特法则时需要反复权衡，确保高内聚和低耦合的同时，保证系统的结构清晰。

### 3.5 接口隔离原则(ISP - Interface Segregation Principle)

> 定义：一个类对另一个类的依赖应该建立在最小的接口上。
> 
> 通俗来说，就是要尽量细化接口，接口中的方法尽量少。

采用接口隔离原则对接口进行约束时，要注意以下几点：

1. **接口尽量小，但是要有限度**：对接口进行细化可以提高程序设计灵活性是不挣的事实，但是如果过小，则会造成接口数量过多，使设计复杂化。所以一定要适度。
2. **为依赖接口的类定制服务**：只暴露给调用的类它需要的方法，它不需要的方法则隐藏起来。只有专注地为一个模块提供定制服务，才能建立最小的依赖关系。
3. **提高内聚，减少对外交互**：使接口用最少的方法去完成最多的事情。

### 3.6 依赖倒置原则(DIP - Dependence Inversion Principle)

> 定义：高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象。
> 
> 核心思想：要面向接口编程，不要面向实现编程。

依赖倒置原则是实现开闭原则的重要途径之一，它降低了客户与实现模块之间的耦合。

依赖倒置原则，有以下作用：

1. 依赖倒置原则可以降低类间的耦合性。
2. 依赖倒置原则可以提高系统的稳定性。
3. 依赖倒置原则可以减少并行开发引起的风险。
4. 依赖倒置原则可以提高代码的可读性和可维护性。

依赖倒置原则的目的是通过要面向接口的编程来降低类间的耦合性。所以在实际编程中，主要遵循以下4点，就能在项目中满足这个规则：

1. 每个类尽量提供接口或抽象类，或者两者都具备。
2. 变量的声明类型尽量是接口或者是抽象类。
3. 任何类都不应该从具体类派生。
4. 使用继承时尽量遵循里氏替换原则。

### 3.7 六大原则总结

* **单一职责原则**告诉我们实现类要职责单一；
* **里氏替换原则**告诉我们不要破坏继承体系；
* **依赖倒置原则**告诉我们要面向接口编程；
* **接口隔离原则**告诉我们在设计接口的时候要精简单一；
* **最少知识原则**告诉我们要降低耦合；
* **开闭原则**是总纲，它告诉我们要对扩展开放，对修改关闭。
