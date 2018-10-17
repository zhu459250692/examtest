package designpattern.single;

import org.junit.Test;

public class UnitTest {
    @Test
    public void TestSingle() {
        Single s = null;
        s = s.getSingle();
        Single s2 = null;
        s2 = s2.getSingle();
        System.out.println(s == s2);
    }
}
