package app.controllers;

import org.javalite.activeweb.controller_filters.HttpSupportFilter;

import java.util.GregorianCalendar;

/**
 * Dynamically inserts current year in the footer.
 * @author Igor Polevoy: 5/1/12 7:25 PM
 */
public class CopyrightYearFilter extends HttpSupportFilter {
    @Override
    public void before() {
        view("year", new GregorianCalendar().get(GregorianCalendar.YEAR));
    }
}
