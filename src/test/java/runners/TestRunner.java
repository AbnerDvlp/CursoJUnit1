package runners;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suite de testes Facebook e Google")
@SelectPackages("testes")
@IncludeTags("Tag3")
//@IncludeTags("Tag1")
//@ExcludeTags("Tag2,Tag1")
//@ExcludePackages("testes")
public class TestRunner {
	

}
