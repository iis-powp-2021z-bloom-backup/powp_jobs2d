package edu.kis.powp.jobs2d.collection;

import java.util.Arrays;

public enum TestNames {

    FIGURE_JOE_1("Figure Joe 1"),
    FIGURE_JOE_2("Figure Joe 2"),
    FIGURE_JANE_1("Figure Jane 1");

    private final String label;

    TestNames(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static TestNames getByLabel(String label) {
        return Arrays.stream(values()).filter(value -> value.getLabel().equals(label)).findFirst().orElse(null);
    }

}
