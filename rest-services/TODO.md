# TODO List

This file contains a list of things that I would like to do to improve on the existing API or to address technical debt

## Immediate Items
1. RenderPdfForm server tests (in rest_services.it-tests.server.forms and rest_services.it-tests.client.forms) are not complete.  Currently sending the submitUrl and/or the Cache Strategy cause an internal error response.  These errors should be located and corrected.

3. Improve tests in RestServicesFormsServiceAdapterTest.
   1. Add more importData tests for exceptional case (i.e. those cases where exceptions are thrown.)
   2. Improve mocking based on [https://maciejwalkowiak.com/mocking-fluent-interfaces/](https://maciejwalkowiak.com/mocking-fluent-interfaces/)
   3. Add tests for RenderPdfForm().  There are currently no tests here, it falls on the integration tests to find issues within the adapter code which is not ideal.

1. Add support for a Correlation ID header field (write it out to the log).  This has already been added in the client code, but needs to be added to the server code.

1. Add tests and code in rest-services.client to handle non-PDF responses from AEM.  For example, if the service is not available, then AEM may return an HTML "Content Created" or "Content Modified" response.

## Longer Term Items
1. Having an automated test of the PDFs returned from the integration tests would be nice.  This is probably a lot of work however, so it is on the back burner.

1. Provide a configuration mechanism that allows someone to point to a "forms directory".  This would override the contentRoot provided (or work in convert with it).  The code would check to make sure that the resulting template location is in or below the "forms directory".  This is for security reasons (so someone can't specify a content root and/or form that accesses something on the local disk they shouldn't).
