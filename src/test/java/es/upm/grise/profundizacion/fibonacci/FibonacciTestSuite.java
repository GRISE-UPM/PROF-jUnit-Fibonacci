package es.upm.grise.profundizacion.fibonacci;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(FibonacciTest.class)
// Need to rename TestXXX
public class FibonacciTestSuite {}
