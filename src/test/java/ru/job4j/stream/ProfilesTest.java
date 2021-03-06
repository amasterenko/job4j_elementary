package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.Address;
import ru.job4j.stream.Profile;
import ru.job4j.stream.Profiles;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenAddressCollect() {
        List<Profile> list = Arrays.asList(
                new Profile(new Address("London", "Piccadilly", 12, 2)),
                new Profile(new Address("Moscow", "Tverskaya", 5, 3)),
                new Profile(new Address("Paris", "Pont Neuf", 15, 7)),
                new Profile(new Address("London", "Piccadilly", 12, 2))
        );
        List<Address> expected = Arrays.asList(
                new Address("London", "Piccadilly", 12, 2),
                new Address("Moscow", "Tverskaya", 5, 3),
                new Address("Paris", "Pont Neuf", 15, 7)
        );
        assertThat(Profiles.collect(list), is(expected));
    }
}