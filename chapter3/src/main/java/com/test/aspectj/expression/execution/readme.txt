execution() 测试demo


execution(public * *(..))	表示匹配所有目标类的 public 方法 。 第一个 * 代表任意返回类型，第二个 * 代表方法名，而 .. 代表任意入参的方法。
execution(* m*(..))	表示匹配目标类所有以 m 为前缀的方法。 第一个*代表任意返回类型，而m*代表任意以 m 为前缀的方法。这里匹配 make()方法。


execution(* com.test.aspectj.expression.Factory.*(..))	匹配  接口的所有方法，即这里的 make() 。第一个*代表任意返回类型， com.test.aspectj.expression.Factory.* 表示 Factory 接口的所有方法。


.*	包中的所有类，不包括子孙包中的类。
..*	包中以及子孙包的所有类。


*	表示任意类型参数。
..	表示任意类型参数且参数不限个数。


execution(* make(int,String))	这会匹配 make(int,String) 方法。如果方法中的入参类型是 java.lang 包下的类，那么可以直接使用类名；如果是其他类型，那么必须使用全限定名。
execution(* make(int,*))	匹配 make() 方法，该方法的第一个入参是 int，第二个参数可以是任意类型。
execution(* make(int,..))	匹配 make() 方法，该方法的第一个入参是 int，后面可以有任意类型的入参且参数个数不限。
execution(* make(Object+))	匹配 make() 方法，方法只有一个入参，它可以是 Object 类型或该类型的子类。



