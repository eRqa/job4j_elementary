package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class SwitchWeekTest {

    @Test
    public void nameOfDayWhen1ThenMonday() {

        String act = SwitchWeek.nameOfDay(1);
        String expected = "Понедельник";

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void nameOfDayWhenThenTuesday() {

        String act = SwitchWeek.nameOfDay(2);
        String expected = "Вторник";

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void nameOfDayWhen3ThenWednesday() {

        String act = SwitchWeek.nameOfDay(3);
        String expected = "Среда";

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void nameOfDayWhen4ThenThursday() {

        String act = SwitchWeek.nameOfDay(4);
        String expected = "Четверг";

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void nameOfDayWhen5ThenFriday() {

        String act = SwitchWeek.nameOfDay(5);
        String expected = "Пятница";

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void nameOfDayWhen6ThenSaturday() {

        String act = SwitchWeek.nameOfDay(6);
        String expected = "Суббота";

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void nameOfDayWhen7ThenSunday() {

        String act = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";

        Assert.assertThat(act, is(expected));

    }
}