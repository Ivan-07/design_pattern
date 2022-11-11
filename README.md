## Iterator模式 ——一个一个遍历
为什么要用迭代器模式？

`分离实现和遍历`，例如这里对bookShelf的遍历不依赖于该类。好处就是当修改存储方式，如数组改为vector时，代码依旧可以工作，这体现了设计模式中很重要的一点——"可复用"！

## Adapter模式 ——加个适配器以便于复用
实现方式1——继承：

利用继承的方式隐藏了Banner类及其方法的具体实现，展现给用户的就是Print这样的接口。这就好比笔记本电脑只需要在直流12伏特电压下就能正常工作，而不需要知道它其实是由100伏特交流电压经适配器转换而成的。

实现方式2——委托：

利用委托的方式隐藏了Banner类及其方法的具体实现，当实际输出的为对象而不是接口时，由于Java单继承机制，我们需要使用委任的方式来做适配。
![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211022132071.png)

什么时候使用Adapter模式？

其实这种设计模式大多使用在我们需要在经测试无误的版本代码基础上进行二次开发的场景。
比如使用现有工具类，我们不会在原有代码上进行修改，而是封装出新的类。
比如进行版本升级时，我们的新版本就是Adaptee，旧版本就是Target，我们需要编写一个Adapter使用新版本的类来实现旧版本中的方法，这样就可以只用维护新版本的代码了。

## Template模式——将具体处理交给子类
**角色：**
- 抽象类：要负责实现模板方法，同时要声明模板中使用的抽象方法，抽象方法的具体实现由子类负责
- 具体类：负责实现抽象类中的抽象方法

为什么要使用模板模式？

它的优点是在父类的模板方法中就编写类算法，无需在每个子类中再编写算法

## Factory模式——将实例的生成交给子类
![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211031044478.png)

**角色**：
- 框架
  - Product：是一个抽象类，决定了在工厂模式中生成的实例所持有的接口。
  - Creator：是一个抽象类，负责生成Product。
- 具体实现
  - ConcreteCreator
  - ConcreteProduct

Factory模式本质上其实就是Template模式的一种特殊情况：模板化生产实例的方法，专注对实例的生成。

## Singleton模式——只有一个实例
目的：保证该类只有一个实例
实现：通过私有化构造器，提供一个类的静态方法来获取该类持有的唯一实例。

## Prototype模式——通过复制生成实例
**角色**：
- Prototype：原型，负责定义用于复制现有实例来生成新实例的方法，这里是Product
- ConcretePrototype：具体的原型，在这里是MessageBox
- Client：负责使用复制实例的方法来生成新实例，这里是Manger
  ![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211031225329.png)
  为什么要使用该模式？
1. 对象种类繁多，无法将他们整合到一个类中
2. 难以根据类生成实例时
3. 想解耦框架和生成的实例时

## Builder模式——组装复杂的实例
**角色：**
- Builder：定义了生成实例的接口，包含了所需的一些方法
- ConcreteBuilder：实际实现Builder接口的类
- Director：负责调度使用Builder中的方法
  ![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211031810244.png)

>Builder模式和Template模式有什么区别呢？个人理解Template模式在抽象类（父类）中即规定了实际的调度方法（对应于Builder模式中Director中的方法）。这里的调度方法指的是对抽象方法的组合应用。

## Abstract Factory模式——将关键零件组装成产品
抽象工厂模式是围绕一个超级工厂来创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创造对象的最佳方式。
>理解产品族和产品等级。
>产品族：一个品牌下的所有产品。如华为旗下的手机、路由器，称为华为的产品族
>产品等级：多个品牌下的同种产品：例如华为的手机和小米的手机，称为一个产品等级

以下图为例，有手机和路由器两种产品，有华为和小米两种品牌，两种品牌都可以生产手机和路由器；
1. 有手机和路由器两种产品，定义两个接口；
2. 小米和华为都可以生产这两种产品，所以有4个实现类；
3. 现在需要创建华为和小米的工厂类，先将工厂类进行抽象，里面有创建两个产品的方法，返回的是产品的接口类；
4. 创建华为和小米的工厂实现类，继承工厂类接口，实现创建各自产品的方法；
5. 客户端调用时，直接用工厂接口类创建需要的工厂，拿到对应的产品；
   ![](https://img-blog.csdnimg.cn/20201125000745500.png)

**优点：**
- 一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象（将一个系列的产品统一一起创建）；

**缺点：**
- 产品等级扩展非常困难，要增加一种新产品（如增加笔记本），既要修改工厂抽象类里加代码，又修改具体的实现类里面加代码；
- 增加了系统的抽象性和理解难度；

**适用场景：**
-   一系列相关产品对象（属于同一产品族）一起创建时需要大量的重复代码；
-   提供一个产品类的库，所有的产品以同样的接口出现，从而使得客户端不依赖于具体的实现；


## Bridge模式
- 类的功能层次结构：
  - 父类具有基本的功能
  - 在子类中增加新的功能
- 类的实现层次结构：
  - 父类通过声明抽象方法来定义接口（API）
  - 子类通过实现具体方法来实现接口（API）

Bridge模式就是搭建这样一座连接功能层次结构和实现层次结构的桥梁。

**角色：**
- Abstraction：该角色位于功能层次最上层，使用Implementor角色定义的方法定义了基本的功能。该角色保存了Implementor角色的实例。
- RefinedAbstraction：在Abstraction基础上增加了新功能的角色
- Implementor：位于实现层次的最上层。定义了用于实现Abstraction角色接口的方法。
- ConcreteImplementor：负责实现在Implementor角色中定义的接口。

![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211051043998.png)

## Strategy模式
![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211051157263.png)

## Composite模式
**角色：**
- Leaf：表示“内容”的角色。在该角色中不能放入其他对象。
- Composite：表示容器的角色，可以在其中放入Leaf和Composite。
- Component：使Leaf角色和Composite角色具有一致性的角色。Component角色是Leaf和Composite的父类。
- Client：使用Composite模式的角色

![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211051236706.png)

## Decorator模式
>假如现在有一块蛋糕，如果只涂上奶油，其他什么都不加，就是奶油蛋糕。如果加上草莓，就是草莓奶油蛋糕。如果再加上一块黑色巧克力板，上面用白色巧克力写上姓名，然后插上代表年龄100的蜡烛，就变成了一块生日蛋糕。

Decorator模式的目的就是实现这样对“蛋糕”不断做装饰，增加其功能，使其变成使用目的更加明确的对象。

**角色：**
- Component：增加功能时的核心角色，定义了装饰前的蛋糕的接口。这里是Display类
- ConcreteComponent：蛋糕的具体实现类，这里是StringDisplay
- Decorator：具有与Component相同的接口，内部保存有被装饰的对象——Component角色。这里是Border
- ConcreteDecorator：具体的装饰物，这里是SideBorder和FullBorder
  ![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211051725568.png)
  好处：
- 接口的透明性：装饰物是被装饰物的子类，这样的好处就是不会把被装饰物的接口隐藏起来，始终保持其接口透明
- 在不改变被装饰物的前提下增加功能：不需要对被装饰的类做任何修改
- 可以动态地增加功能：使用了委托模式，就可以不用改变框架代码而生成一个与其他对象具有不同关系的新对象
- 可以自由组合装饰物：这样就可以在少量装饰物情况下组合出许多功能

## Visitor模式
**角色：**
- Visitor：访问者。用于对数据结构中每一个具体的元素（concreteElement）声明一个访问方法
- ConcreteVisitor：具体的访问者
- Element：表示Visitor的访问对象。它声明了接收访问者的accept方法。
- ConcreteElement：实现Element角色所定义的接口
- ObjectStructure：负责处理Element角色的集合
  ![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211062033870.png)

为什么要使用Visitor模式：
目的是将处理从数据结构中抽离出来，提升了组件的独立性，符合开闭原则——对拓展开发，对修改关闭。

## Chain of Resiponsibility
**角色：**
- Handler：定义了处理请求对接口。Handler知道下一个“处理者”是谁，如果自己无法处理请求，就会把请求传递给下一个处理者。下一个处理者也是Handler。
- ConcreteHandler：具体的处理者
- Client：向第一个ConcreteHandler发送请求的角色

![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211071806973.png)

**好处：** 大大弱化了发送请求的人和处理请求的人之间的关系。也就是说发送请求的人无需知道具体处理请求的人是谁，体现了其作为可复用组件的独立性。另外，这样可以使得每个对象专注于自己负责的处理工作。


## Proxy模式
**角色：**
- Subject：主体。定义了Proxy和RealSubject之间具有一致性的接口，所以Client角色无需在意他是本人还是代理
- Proxy：代理人。会尽量处理来自Client的请求，只有当自己不能处理的时候才会把任务交给主体
- Client：请求者。

**为什么要用Proxy模式：**
能够提升处理速度。通过使用Proxy模式，尽可能由代理人来处理请求响应较快的请求，将一些任务推迟到不得不由本人来处理的时候。例如，在一个大型项目的初始化过程中，一些暂时不会被使用的功能也初始化了，这会造成用户的体验不佳。

**代理与委托**
这里当遇到代理人不能处理的任务时，这些任务会被委托给本人处理，这体现了委托的思想。


## Observer模式
**角色：**
- Subject：观察对象。定义了注册观察者和删除观察者的方法。还声明了获取当前状态的方法。
- ConcreteSubject：具体的观察对象
- Observer：观察者，负责接收来自Subject角色状态变化的通知，还声明了根据通知来而执行的动作：update
- ConcreteObserver：具体的观察者

![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211112215795.png)
