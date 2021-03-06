package nl.smerik.adventofcode.aoc2020.day;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Day04ServiceTest {

    @Autowired
    private Day04Service dayService;

    @Test
    void getSolutionPart1() {
        assertEquals(260, dayService.getSolutionPart1());
    }

    @Test
    void getSolutionPart2() {
        assertEquals(153, dayService.getSolutionPart2());
    }
}