package test_case;

/* 
Junit
 test suite class */ 
import 
org.junit.runner.RunWith
; 
import 
org.junit.runners.Suite
; 
@
RunWith
(
Suite.class
) 
@
Suite.SuiteClasses
({ 
add1.class, 
delete.class,
search.class
}) 
public class 
TestSuite
 {    } 
