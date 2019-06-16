package com.magneto.cerebro.utils.sequenceFinder.builder;

import com.magneto.cerebro.utils.sequenceFinder.SequenceFinder;

public class SequenceFinderBuildDirector {
    private ISequenceFinderManagerBuilder builder;

    public SequenceFinderBuildDirector(ISequenceFinderManagerBuilder builder) {
        this.builder = builder;
    }

    public SequenceFinder construct(String[] array, int matchLength) {
         return builder.setArray(array).setMatchLength(matchLength).build();
    }
}
