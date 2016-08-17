package de.schroepf.androidxmlrunlistener;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.xmlpull.v1.XmlSerializer;

/**
 * @author Tobias Schröpf on 17.08.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class XmlRunListenerTest {

    @Mock
    XmlSerializer mockXmlSerializer;

    @Test
    public void testTestFailure() throws Exception {
        XmlRunListener runListener = new XmlRunListener(mockXmlSerializer);

        Description description = Description.createTestDescription(Object.class, "aSimpleTestCase");
        Throwable throwable = new Throwable();
        Failure failure = new Failure(description, throwable);
        runListener.testFailure(failure);
    }

    @Test
    public void testTestAssumptionFailure() throws Exception {

    }

    @Test
    public void testTestIgnored() throws Exception {

    }
}