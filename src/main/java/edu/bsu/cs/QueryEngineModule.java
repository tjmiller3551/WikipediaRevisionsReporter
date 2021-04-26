package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.model.Formatter;
import edu.bsu.cs.view.FixedRevisionFormatter;
import edu.bsu.cs.model.QueryEngine;
import edu.bsu.cs.model.WikipediaQueryEngine;

import java.time.Duration;

public class QueryEngineModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(QueryEngine.class).to(WikipediaQueryEngine.class);
        bind(Duration.class).toInstance(Duration.ofSeconds(2));
        bind(Formatter.class).to(FixedRevisionFormatter.class);
    }
}
