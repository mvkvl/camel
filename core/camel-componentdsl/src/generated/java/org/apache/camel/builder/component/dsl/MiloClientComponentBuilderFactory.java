/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.milo.client.MiloClientComponent;

/**
 * Connect to OPC UA servers using the binary protocol for acquiring telemetry
 * data.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MiloClientComponentBuilderFactory {

    /**
     * OPC UA Client (camel-milo)
     * Connect to OPC UA servers using the binary protocol for acquiring
     * telemetry data.
     * 
     * Category: iot
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-milo
     */
    static MiloClientComponentBuilder miloClient() {
        return new MiloClientComponentBuilderImpl();
    }

    /**
     * Builder for the OPC UA Client component.
     */
    interface MiloClientComponentBuilder
            extends
                ComponentBuilder<MiloClientComponent> {
        /**
         * A virtual client id to force the creation of a new connection
         * instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder clientId(java.lang.String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * All default options for client configurations.
         * 
         * The option is a:
         * <code>org.apache.camel.component.milo.client.MiloClientConfiguration</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder configuration(
                org.apache.camel.component.milo.client.MiloClientConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * A suffix for endpoint URI when discovering.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder discoveryEndpointSuffix(
                java.lang.String discoveryEndpointSuffix) {
            doSetProperty("discoveryEndpointSuffix", discoveryEndpointSuffix);
            return this;
        }
        /**
         * An alternative discovery URI.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MiloClientComponentBuilder discoveryEndpointUri(
                java.lang.String discoveryEndpointUri) {
            doSetProperty("discoveryEndpointUri", discoveryEndpointUri);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default MiloClientComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MiloClientComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default MiloClientComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * A set of allowed security policy URIs. Default is to accept all and
         * use the highest.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder allowedSecurityPolicies(
                java.lang.String allowedSecurityPolicies) {
            doSetProperty("allowedSecurityPolicies", allowedSecurityPolicies);
            return this;
        }
        /**
         * The application name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: Apache Camel adapter for Eclipse Milo
         * Group: client
         */
        default MiloClientComponentBuilder applicationName(
                java.lang.String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * The application URI.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: http://camel.apache.org/EclipseMilo/Client
         * Group: client
         */
        default MiloClientComponentBuilder applicationUri(
                java.lang.String applicationUri) {
            doSetProperty("applicationUri", applicationUri);
            return this;
        }
        /**
         * Channel lifetime in milliseconds.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder channelLifetime(
                java.lang.Long channelLifetime) {
            doSetProperty("channelLifetime", channelLifetime);
            return this;
        }
        /**
         * The name of the key in the keystore file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder keyAlias(java.lang.String keyAlias) {
            doSetProperty("keyAlias", keyAlias);
            return this;
        }
        /**
         * The key password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder keyPassword(
                java.lang.String keyPassword) {
            doSetProperty("keyPassword", keyPassword);
            return this;
        }
        /**
         * The keystore password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder keyStorePassword(
                java.lang.String keyStorePassword) {
            doSetProperty("keyStorePassword", keyStorePassword);
            return this;
        }
        /**
         * The key store type.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder keyStoreType(
                java.lang.String keyStoreType) {
            doSetProperty("keyStoreType", keyStoreType);
            return this;
        }
        /**
         * The URL where the key should be loaded from.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder keyStoreUrl(
                java.lang.String keyStoreUrl) {
            doSetProperty("keyStoreUrl", keyStoreUrl);
            return this;
        }
        /**
         * The maximum number of pending publish requests.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder maxPendingPublishRequests(
                java.lang.Long maxPendingPublishRequests) {
            doSetProperty("maxPendingPublishRequests", maxPendingPublishRequests);
            return this;
        }
        /**
         * The maximum number of bytes a response message may have.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder maxResponseMessageSize(
                java.lang.Long maxResponseMessageSize) {
            doSetProperty("maxResponseMessageSize", maxResponseMessageSize);
            return this;
        }
        /**
         * Override the server reported endpoint host with the host from the
         * endpoint URI.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: client
         */
        default MiloClientComponentBuilder overrideHost(boolean overrideHost) {
            doSetProperty("overrideHost", overrideHost);
            return this;
        }
        /**
         * The product URI.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: http://camel.apache.org/EclipseMilo
         * Group: client
         */
        default MiloClientComponentBuilder productUri(
                java.lang.String productUri) {
            doSetProperty("productUri", productUri);
            return this;
        }
        /**
         * The requested publishing interval in milliseconds.
         * 
         * The option is a: <code>java.lang.Double</code> type.
         * 
         * Default: 1_000.0
         * Group: client
         */
        default MiloClientComponentBuilder requestedPublishingInterval(
                java.lang.Double requestedPublishingInterval) {
            doSetProperty("requestedPublishingInterval", requestedPublishingInterval);
            return this;
        }
        /**
         * Request timeout in milliseconds.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder requestTimeout(
                java.lang.Long requestTimeout) {
            doSetProperty("requestTimeout", requestTimeout);
            return this;
        }
        /**
         * Session name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder sessionName(
                java.lang.String sessionName) {
            doSetProperty("sessionName", sessionName);
            return this;
        }
        /**
         * Session timeout in milliseconds.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: client
         */
        default MiloClientComponentBuilder sessionTimeout(
                java.lang.Long sessionTimeout) {
            doSetProperty("sessionTimeout", sessionTimeout);
            return this;
        }
    }

    class MiloClientComponentBuilderImpl
            extends
                AbstractComponentBuilder<MiloClientComponent>
            implements
                MiloClientComponentBuilder {
        @Override
        protected MiloClientComponent buildConcreteComponent() {
            return new MiloClientComponent();
        }
        private org.apache.camel.component.milo.client.MiloClientConfiguration getOrCreateConfiguration(
                org.apache.camel.component.milo.client.MiloClientComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.milo.client.MiloClientConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "clientId": getOrCreateConfiguration((MiloClientComponent) component).setClientId((java.lang.String) value); return true;
            case "configuration": ((MiloClientComponent) component).setConfiguration((org.apache.camel.component.milo.client.MiloClientConfiguration) value); return true;
            case "discoveryEndpointSuffix": getOrCreateConfiguration((MiloClientComponent) component).setDiscoveryEndpointSuffix((java.lang.String) value); return true;
            case "discoveryEndpointUri": getOrCreateConfiguration((MiloClientComponent) component).setDiscoveryEndpointUri((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((MiloClientComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((MiloClientComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((MiloClientComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "allowedSecurityPolicies": getOrCreateConfiguration((MiloClientComponent) component).setAllowedSecurityPolicies((java.lang.String) value); return true;
            case "applicationName": getOrCreateConfiguration((MiloClientComponent) component).setApplicationName((java.lang.String) value); return true;
            case "applicationUri": getOrCreateConfiguration((MiloClientComponent) component).setApplicationUri((java.lang.String) value); return true;
            case "channelLifetime": getOrCreateConfiguration((MiloClientComponent) component).setChannelLifetime((java.lang.Long) value); return true;
            case "keyAlias": getOrCreateConfiguration((MiloClientComponent) component).setKeyAlias((java.lang.String) value); return true;
            case "keyPassword": getOrCreateConfiguration((MiloClientComponent) component).setKeyPassword((java.lang.String) value); return true;
            case "keyStorePassword": getOrCreateConfiguration((MiloClientComponent) component).setKeyStorePassword((java.lang.String) value); return true;
            case "keyStoreType": getOrCreateConfiguration((MiloClientComponent) component).setKeyStoreType((java.lang.String) value); return true;
            case "keyStoreUrl": getOrCreateConfiguration((MiloClientComponent) component).setKeyStoreUrl((java.lang.String) value); return true;
            case "maxPendingPublishRequests": getOrCreateConfiguration((MiloClientComponent) component).setMaxPendingPublishRequests((java.lang.Long) value); return true;
            case "maxResponseMessageSize": getOrCreateConfiguration((MiloClientComponent) component).setMaxResponseMessageSize((java.lang.Long) value); return true;
            case "overrideHost": getOrCreateConfiguration((MiloClientComponent) component).setOverrideHost((boolean) value); return true;
            case "productUri": getOrCreateConfiguration((MiloClientComponent) component).setProductUri((java.lang.String) value); return true;
            case "requestedPublishingInterval": getOrCreateConfiguration((MiloClientComponent) component).setRequestedPublishingInterval((java.lang.Double) value); return true;
            case "requestTimeout": getOrCreateConfiguration((MiloClientComponent) component).setRequestTimeout((java.lang.Long) value); return true;
            case "sessionName": getOrCreateConfiguration((MiloClientComponent) component).setSessionName((java.lang.String) value); return true;
            case "sessionTimeout": getOrCreateConfiguration((MiloClientComponent) component).setSessionTimeout((java.lang.Long) value); return true;
            default: return false;
            }
        }
    }
}