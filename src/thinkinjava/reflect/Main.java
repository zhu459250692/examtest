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
        //�����д��
        //��ȡ����Դͷ
        //�������Դͷ�����Դ������󣬿��Ի�ȡ��Ӧ����ʱ��������ṹ�����ԡ����������������ڲ��ุ����쳣ע�⣩
        Class<Person> classPerson = Person.class;
        //�÷����ȡ���󣬸�������и��ܷ��ʵ��Ŀղι�������Ҳ����д���вεĹ�����һ��Ҫд�޲εĹ�����
        Person p = (Person)classPerson.newInstance();
        System.out.println(p);
        //����
        Field f1 = classPerson.getField("name");
        f1.set(p, "zhuzhu");
        System.out.println(p);
        //˽������
        Field f2 = classPerson.getDeclaredField("age");
        f2.setAccessible(true);
        f2.set(p, 20);
        System.out.println(p);
        System.out.println();

        //����
        Method m = classPerson.getMethod("show", String.class);
        m.invoke(p, "china");
        System.out.println();

        //�����������ֻ�ȡ����ʱ����ķ���
        String className = "thinkinjava.reflect.Person";

        Class classPerson3 = Class.forName(className);

        ClassLoader classLoader = this.getClass().getClassLoader();
        Class classPerson4 = classLoader.loadClass(className);

        System.out.println(classPerson3.getName());
        System.out.println(classPerson4.getName());
    }

    @Test
    public void testClassLoader() throws Exception{
        //���ClassLoader
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
//        Class classObject = Class.forName("java.lang.Object");
//        System.out.println(classObject.getClassLoader());

        //ClassLoader����
        ClassLoader loader1 = this.getClass().getClassLoader();
        InputStream inputStream = loader1.getResourceAsStream("thinkinjava\\reflect\\jdbc.properties");
        Properties properties = new Properties();
        properties.load(inputStream);//���ؽ�����
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }

    @Test
    public void testPerson() {
        //��ǰ��д��
        Person p = new Person();
        p.setAge(20);
        System.out.println(p.getAge());
        p.show("china");
        //getClass()����
        //ͨ������ʱ��Ķ��󣬵���getClass()��������������������
        //������.class�ļ�,��һ���أ�.class�ʹ�����
        Class classPerson = p.getClass();
        System.out.println(classPerson);
    }

    //��ȡ����
    @Test
    public void testAAA(){
        Class classPerson2 = Person2.class;

        //1.getFields():��ȡ���༰�丸���public������
        Field[] fields = classPerson2.getFields();
        for(int i = 0; i < fields.length; i++)
            System.out.println(fields[i]);
        //2.getDeclaredFields():��ȡ�౾����������������
        Field[] fields2 = classPerson2.getDeclaredFields();
        for(Field f : fields2)
            System.out.println(f);
    }

    //Ȩ�����η� �������� ������
    //��ȡ���Եĸ������ֵ�����
    @Test
    public void testBBB(){
        Class classPerson2 = Person2.class;

        Field[] fields = classPerson2.getFields();
        for(Field f : fields){
            //1.��ȡÿ������Ȩ�����η�,Modifier��д��toString����
            int i = f.getModifiers();
            System.out.println(Modifier.toString(i) + " ");
            //2.��ȡ���Ե�����
            Class type = f.getType();
            System.out.println(type.getName() + " ");
            //3.��ȡ������
            System.out.println(f.getName());

            System.out.println();
        }
    }

    //��ȡ����
    @Test
    public void testCCC(){
        Class classPerson2 = Person.class;

        //1.getMethods()��ȡ�༰�����public����
        Method[] m = classPerson2.getMethods();
        for(Method m1 : m){
            System.out.println(m1);
        }
        //2 getDeclaredMethods()�౾������з���

        //�����Ի�ȡע�⡢Ȩ�����η�������ֵ���͡����������β��б��쳣����

        //��ȡ������

        //��ȡ���࣬����ķ���

        //��ȡʵ�ֵĽӿڣ���ȡ����ע��
    }


}
