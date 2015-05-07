package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void testcamelToSnakecaseRuns() {
		SnakeCamelUtil util = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = util.camelToSnakecase("AbcDefGhi");
		//fail("Not yet implemented");
		assertThat(actual,is(expected));
	}
	@Test
	public void testcamelToSnakecaseRuns2() {
		SnakeCamelUtil util = new SnakeCamelUtil();
		String expected = "a_bc_def_ghij";
		String actual = util.camelToSnakecase("ABcDefGhij");
		//fail("Not yet implemented");
		assertThat(actual,is(expected));
	}
/*	@Test
	public void testcamelToSnakecaseFails() {
		SnakeCamelUtil util = new SnakeCamelUtil();
		String expected = "a_bc_defghij";
		String actual = util.camelToSnakecase("ABcDefGhij");
		//fail("Not yet implemented");
		assertThat(actual,is(expected));
	}*/
	@Test
	public void testSnakeToCamelcaseRuns() {
		SnakeCamelUtil util = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = util.snakeToCamelcase("abc_def_ghi");
		//fail("Not yet implemented");
		assertThat(actual,is(expected));
	}
	@Test
	public void testSnakeToCamelcaseRuns2() {
		SnakeCamelUtil util = new SnakeCamelUtil();
		String expected = "ABcDefGhij";
		String actual = util.snakeToCamelcase("a_bc_def_ghij");
		//fail("Not yet implemented");
		assertThat(actual,is(expected));
	}
/*	@Test
	public void testSnakeToCamelcaseFails() {
		SnakeCamelUtil util = new SnakeCamelUtil();
		String expected = "ABcDefghij";
		String actual = util.snakeToCamelcase("a_bc_def_ghij");
		//fail("Not yet implemented");
		assertThat(actual,is(expected));
	}*/
}
