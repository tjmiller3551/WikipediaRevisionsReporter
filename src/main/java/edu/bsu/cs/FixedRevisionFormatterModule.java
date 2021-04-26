package edu.bsu.cs;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import edu.bsu.cs.model.Formatter;
import edu.bsu.cs.view.FixedRevisionFormatter;

public class FixedRevisionFormatterModule extends AbstractModule {
    @Override
    protected void configure(){
        bind(Formatter.class).to(FixedRevisionFormatter.class);
    }
}
