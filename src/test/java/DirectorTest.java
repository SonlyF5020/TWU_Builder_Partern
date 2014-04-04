import com.thoughtworks.warlock.Director;
import com.thoughtworks.warlock.Person;
import com.thoughtworks.warlock.WarlockBuilder;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DirectorTest {

    Director director = new Director();

    @Test
    public void directorShouldConstructWarlock() throws Exception {
        Person person = director.constructWarlock(new WarlockBuilder());

        assertThat(person.getHead() , is("big head"));
        assertThat(person.getBody() , is("strong body"));
        assertThat(person.getFoot() , is("jump foot"));
    }
}
