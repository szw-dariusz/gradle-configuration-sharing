package ds.gradledepmngmnt.a;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

final class BasicScenarios {

    @Test
    void falseIsFalse() {
        then(false).isFalse();
    }
}
