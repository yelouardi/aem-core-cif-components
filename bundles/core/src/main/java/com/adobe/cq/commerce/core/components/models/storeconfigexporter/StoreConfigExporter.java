/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2019 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.commerce.core.components.models.storeconfigexporter;

import org.osgi.annotation.versioning.ProviderType;

import com.drew.lang.annotations.Nullable;

/**
 * This model gives access to the cif cloud service configuration of a given Page.
 * <p>
 * Its implementation is an adapter of {@link org.apache.sling.api.SlingHttpServletRequest} with the resourceType of a cif page.
 * <p>
 */
@ProviderType
public interface StoreConfigExporter {

    /**
     * @return The Magento store view identifier.
     */
    @Nullable
    String getStoreView();

    /**
     * @return The GraphQL endpoint for client-side components.
     */
    String getGraphqlEndpoint();

    /**
     * @return The HTTP method to be used for GraphQL requests.
     */
    String getMethod();

    /**
     * @return The URL of the storefront homepage
     */
    String getStoreRootUrl();

    /**
     * @return the list of custom HTTP headers configured in addition to the standard ones. This list is in JSON format.
     */
    String getHttpHeaders();
}
