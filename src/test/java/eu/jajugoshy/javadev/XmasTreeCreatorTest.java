package eu.jajugoshy.javadev;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class XmasTreeCreatorTest {

    XmasTreeCreator xmasTreeCreator;

    @Before
    public void init() {
        xmasTreeCreator = new XmasTreeCreator();
    }

    @Test
    public void testSingleRow() {
        String tree = xmasTreeCreator.createXmasTree("x", 1, "top");
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRow() {
        String tree = xmasTreeCreator.createXmasTree("x", 2, "top");
        assertThat(tree, equalTo(
                " x\n" +
                "xxx"));
    }

    @Test
    public void testOddRow() {
        String tree = xmasTreeCreator.createXmasTree("x", 3, "right");
        assertThat(tree, equalTo(
                "x\n" +
                "xxx\n" +
                "x"));
    }

}
