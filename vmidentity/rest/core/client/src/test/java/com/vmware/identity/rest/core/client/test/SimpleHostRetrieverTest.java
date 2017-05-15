/*
 *  Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License.  You may obtain a copy
 *  of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, without
 *  warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */

package com.vmware.identity.rest.core.client.test;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

import com.vmware.identity.rest.core.client.HostRetriever;
import com.vmware.identity.rest.core.client.SimpleHostRetriever;

public class SimpleHostRetrieverTest {

    @Test
    public void testHostRetriever() throws URISyntaxException {
        String host = "localhost";

        SimpleHostRetriever retriever = new SimpleHostRetriever(host);
        URI uri = retriever.getURIBuilder().build();

        assertEquals(uri.getScheme(), HostRetriever.HTTP_SCHEME);
        assertEquals(uri.getHost(), host);
        assertEquals(uri.getPort(), HostRetriever.NO_PORT);
    }

    @Test
    public void testHostRetriever_CustomPort() throws URISyntaxException {
        String host = "localhost";
        int port = 8080;

        SimpleHostRetriever retriever = new SimpleHostRetriever(host, port);
        URI uri = retriever.getURIBuilder().build();

        assertEquals(uri.getScheme(), HostRetriever.HTTP_SCHEME);
        assertEquals(uri.getHost(), host);
        assertEquals(uri.getPort(), port);
    }

    @Test
    public void testHostRetriever_Secure() throws URISyntaxException {
        String host = "localhost";

        SimpleHostRetriever retriever = new SimpleHostRetriever(host, true);
        URI uri = retriever.getURIBuilder().build();

        assertEquals(uri.getScheme(), HostRetriever.HTTPS_SCHEME);
        assertEquals(uri.getHost(), host);
        assertEquals(uri.getPort(), HostRetriever.NO_PORT);
    }

    @Test
    public void testHostRetriever_CustomPortAndSecure() throws URISyntaxException {
        String host = "localhost";
        int port = 8080;

        SimpleHostRetriever retriever = new SimpleHostRetriever(host, port, true);
        URI uri = retriever.getURIBuilder().build();

        assertEquals(uri.getScheme(), HostRetriever.HTTPS_SCHEME);
        assertEquals(uri.getHost(), host);
        assertEquals(uri.getPort(), port);
    }

}
