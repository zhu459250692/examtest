package thinkinjava.reflect;


import org.junit.Test;

import java.io.InputStream;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Properties;

public class Main {
    @Test
    public void testReflectPerson() throws Exception{
        //反射的写法
        //获取反射源头
        //有了这个源头，可以创建对象，可以获取相应运行时类的完整结构（属性、方法、构造器、内部类父类包异常注解）
        Class<Person> classPerson = Person.class;
        //用反射获取对象，该类必须有个能访问到的空参构造器，也就是写了有参的构造器一定要写无参的构造器
        Person p = (Person)classPerson.newInstance();
        System.out.println(p);
        //属性
        Field f1 = classPerson.getField("name");
        f1.set(p, "zhuzhu");
        System.out.println(p);
        //私有属性
        Field f2 = classPerson.getDeclaredField("age");
        f2.setAccessible(true);
        f2.set(p, 20);
        System.out.println(p);
        System.out.println();

        //方法
        Method m = classPerson.getMethod("show", String.class);
        m.invoke(p, "china");
        System.out.println();

        //附加另外两种获取运行时对象的方法
        String className = "thinkinjava.reflect.Person";

        Class classPerson3 = Class.forName(className);

        ClassLoader classLoader = this.getClass().getClassLoader();
        Class classPerson4 = classLoader.loadClass(className);

        System.out.println(classPerson3.getName());
        System.out.println(classPerson4.getName());
    }

    @Test
    public void testClassLoader() throws Exception{
        //体会ClassLoader
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
//        Class classObject = Class.forName("java.lang.Object");
//        System.out.println(classObject.getClassLoader());

        //ClassLoader作用
        ClassLoader loader1 = this.getClass().getClassLoader();
        InputStream inputStream = loader1.getResourceAsStream("thinkinjava\\reflect\\jdbc.properties");
        Properties properties = new Properties();
        properties.load(inputStream);//加载进来了
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }

    @Test
    public void testPerson() {
        //以前的写法
        Person p = new Person();
        p.setAge(20);
        System.out.println(p.getAge());
        p.show("china");
        //getClass()方法
        //通过运行时类的对象，调用getClass()方法，返回这个对象的类
        //它就是.class文件,类一加载，.class就存在了
        Class classPerson = p.getClass();
        System.out.println(classPerson);
    }

    //获取对象
    @Test
    public void testAAA(){
        Class classPerson2 = Person2.class;

        //1.getFields():获取本类及其父类的public的属性
        Field[] fields = classPerson2.getFields();
        for(int i = 0; i < fields.length; i++)
            System.out.println(fields[i]);
        //2.getDeclaredFields():获取类本身声明的所有属性
        Field[] fields2 = classPerson2.getDeclaredFields();
        for(Field f : fields2)
            System.out.println(f);
    }

    //权限修饰符 变量类型 变量名
    //获取属性的各个部分的内容
    @Test
    public void testBBB(){
        Class classPerson2 = Person2.class;

        Field[] fields = classPerson2.getFields();
        for(Field f : fields){
            //1.获取每个属性权限修饰符,Modifier重写了toString方法
            int i = f.getModifiers();
            System.out.println(Modifier.toString(i) + " ");
            //2.获取属性的类型
            Class type = f.getType();
            System.out.println(type.getName() + " ");
            //3.获取属性名
            System.out.println(f.getName());

            System.out.println();
        }
    }

    //获取方法
    @Test
    public void testCCC(){
        Class classPerson2 = Person.class;

        //1.getMethods()获取类及父类的public方法
        Method[] m = classPerson2.getMethods();
        for(Method m1 : m){
            System.out.println(m1);
        }
        //2 getDeclaredMethods()类本身的所有方法

        //还可以获取注解、权限修饰符、返回值类型、方法名、形参列表、异常类型

        //获取构造器

        //获取父类，父类的泛型

        //获取实现的接口，获取包，注解
    }


}
