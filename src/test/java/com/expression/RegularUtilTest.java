package com.expression;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegularUtilTest {
    private List<String> listPhone;
    private List<String> listEmail;
    private List<String> listDate;
    private List<String> listIp;

    @Before
    public void setUp() {
        listPhone = new ArrayList<>();
        listPhone.add("+38(098)555-87-65");
        listPhone.add("+38(097)222-41-25");
        listPhone.add("38(098)555-87-65");
        listPhone.add("+380(98)555-87-65");
        listPhone.add("+38(098)5558765");

        listEmail = new ArrayList<>();
        listEmail.add("sofia.diakonova@gmail.com");
        listEmail.add("sofia_diakonova@gmail.com");
        listEmail.add("12sofia-diakonova@gmail.com");
        listEmail.add("-sofia.diakonova@gmail.com");
        listEmail.add("s*fia.diakonova@gmail");
        listEmail.add("145.diakonova@34gmail-com");

        listDate = new ArrayList<>();
        listDate.add("26.03.2019");
        listDate.add("32.03.2019");
        listDate.add("26.13.2019");
        listDate.add("26.03.1800");
        listDate.add("29.02.2020");
        listDate.add("29.02.2019");
        listDate.add("31.04.1999");
        listDate.add("30.02.2000");

        listIp = new ArrayList<>();
        listIp.add("192.192.0.0");
        listIp.add("256.192.0.0");
        listIp.add("192.192.0");
        listIp.add("255.255.255.255");
    }

    @Test
    public void testPhoneNumber() {
        assertTrue(RegularUtil.isPhoneNumber(listPhone.get(0)));
        assertTrue(RegularUtil.isPhoneNumber(listPhone.get(1)));
        assertFalse(RegularUtil.isPhoneNumber(listPhone.get(2)));
        assertFalse(RegularUtil.isPhoneNumber(listPhone.get(3)));
        assertFalse(RegularUtil.isPhoneNumber(listPhone.get(4)));
    }

    @Test
    public void testEmail() {
        assertTrue(RegularUtil.isEmail(listEmail.get(0)));
        assertTrue(RegularUtil.isEmail(listEmail.get(1)));
        assertTrue(RegularUtil.isEmail(listEmail.get(2)));
        assertFalse(RegularUtil.isEmail(listEmail.get(3)));
        assertFalse(RegularUtil.isEmail(listEmail.get(4)));
        assertFalse(RegularUtil.isEmail(listEmail.get(5)));
    }

    @Test
    public void testDate() {
        assertTrue(RegularUtil.isDate(listDate.get(0)));
        assertFalse(RegularUtil.isDate(listDate.get(1)));
        assertFalse(RegularUtil.isDate(listDate.get(2)));
        assertFalse(RegularUtil.isDate(listDate.get(3)));
        assertTrue(RegularUtil.isDate(listDate.get(4)));
        assertFalse(RegularUtil.isDate(listDate.get(5)));
        assertFalse(RegularUtil.isDate(listDate.get(6)));
        assertFalse(RegularUtil.isDate(listDate.get(7)));
    }

    @Test
    public void testIp() {
        assertTrue(RegularUtil.isIP(listIp.get(0)));
        assertFalse(RegularUtil.isIP(listIp.get(1)));
        assertFalse(RegularUtil.isIP(listIp.get(2)));
        assertTrue(RegularUtil.isIP(listIp.get(3)));
    }
}
