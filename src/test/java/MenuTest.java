import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @org.junit.jupiter.api.Test
    void menuEditarRam() {
        Ram ram = new Ram("a",1,1);
        assertEquals(ram,Menu.menuEditarRam());
    }
}