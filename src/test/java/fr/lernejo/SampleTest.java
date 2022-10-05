package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void sample_op_ADD_return() {
        var sample = new Sample();

        int result = sample.op(Sample.Operation.ADD,3,4);
        Assertions.assertThat(result).isEqualTo(7);
    }
    @Test
    void sample_op_MULT_return() {
        var sample = new Sample();

        int result = sample.op(Sample.Operation.MULT,3,4);
        Assertions.assertThat(result).isEqualTo(12);
    }
    @Test
    void sample_fact_nbellowzero_return() {
        var sample = new Sample();

        Assertions.assertThatIllegalArgumentException()
            .isThrownBy(() -> sample.fact(-12))
            .withMessage("N should be positive");
    }
    @Test
    void sample_fact_nabovezero_return() {
        var sample = new Sample();

        int result = sample.fact(6);
        Assertions.assertThat(result).isEqualTo(720);
    }

}
