package ds.experimental.gradledepmngmnt;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

final class BasicScenarios {

    @Test
    void trueIsTrue() {
        then(true).isTrue();
    }

    @Test
    void falseIsFalse() {
        then(false).isFalse();
    }
}
