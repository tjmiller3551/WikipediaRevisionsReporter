package edu.bsu.cs.view;

import edu.bsu.cs.model.Formatter;
import edu.bsu.cs.model.Revision;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class FixedRevisionFormatter implements Formatter {

    @Override
    public String format(Revision revision) {
        // format used: [user] made changes at [time] on [date]
        return String.format("%s made changes %s",
        revision.name,
        DateTimeFormatter
                .ofPattern("hh:mm:ss uuuu-MM-dd a")
                .withLocale(Locale.getDefault())
                .withZone(ZoneId.systemDefault())
                .format(revision.timestamp));
    }
}
