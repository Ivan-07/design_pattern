## Iterator模式
为什么要用迭代器模式？

分离实现和遍历，例如这里对bookShelf的遍历不依赖于该类。好处就是当修改存储方式，如数组改为vector时，代码依旧可以工作，这体现了设计模式中很重要的一点——"可复用"！

## Adapter模式
实现方式1——继承：

利用继承的方式隐藏了Banner类及其方法的具体实现，展现给用户的就是Print这样的接口。这就好比笔记本电脑只需要在直流12伏特电压下就能正常工作，而不需要知道它其实是由100伏特交流电压经适配器转换而成的。

实现方式2——委托：

利用委托的方式隐藏了Banner类及其方法的具体实现，当实际输出的为对象而不是接口时，由于Java单继承机制，我们需要使用委任的方式来做适配。
![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211022132071.png)

什么时候使用Adapter模式？

其实这种设计模式大多使用在我们需要在经测试无误的版本代码基础上进行二次开发的场景。
比如使用现有工具类，我们不会在原有代码上进行修改，而是封装出新的类。
比如进行版本升级时，我们的新版本就是Adaptee，旧版本就是Target，我们需要编写一个Adapter来做升级。

## Template模式
**角色：**
- 抽象类：要负责实现模板方法，同时要声明模板中使用的抽象方法，抽象方法的具体实现由子类负责
- 具体类：负责实现抽象类中的抽象方法

为什么要使用模板模式？

它的优点是在父类的模板方法中就编写类算法，无需在每个子类中再编写算法

## Factory模式
![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211031044478.png)
**角色**：
- 框架
  - Product：是一个抽象类，决定了在工厂模式中生成的实例所持有的接口。
  - Creator：是一个抽象类，负责生成Product。
- 具体实现
  - ConcreteCreator
  - ConcreteProduct

Factory模式本质上其实就是Template模式的一种特殊情况：模板化生产实例的方法，专注对实例的生成。

## Singleton模式
目的：保证该类只有一个实例
实现：通过私有化构造器，提供一个类的静态方法来获取该类持有的唯一实例。

## Prototype模式
**角色**：
- Prototype：原型，负责定义用于复制现有实例来生成新实例的方法，这里是Product
- ConcretePrototype：具体的原型，在这里是MessageBox
- Client：负责使用复制实例的方法来生成新实例，这里是Manger
  ![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211031225329.png)

为什么要使用该模式？
1. 对象种类繁多，无法将他们整合到一个类中
2. 难以根据类生成实例时
3. 想解耦框架和生成的实例时

## Builder模式
**角色：**
- Builder：定义了生成实例的接口，包含了所需的一些方法
- ConcreteBuilder：实际实现Builder接口的类
- Director：负责调度使用Builder中的方法
![](https://raw.githubusercontent.com/ivan-07/picgoImg/main/data/202211031810244.png)

>Builder模式和Template模式有什么区别呢？个人理解Template模式在抽象类（父类）中即规定了实际的调度方法（对应于Builder模式中Director中的方法）。这里的调度方法指的是对抽象方法的组合应用。