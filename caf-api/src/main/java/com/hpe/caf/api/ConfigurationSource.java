/*
 * (c) Copyright 2015-2016 Hewlett Packard Enterprise Development LP
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hpe.caf.api;


/**
 * A ConfigurationSource is intended to provide an implementation-agnostic method of
 * retrieving application-specific configuration.
 */
public interface ConfigurationSource
{
    /**
     * Acquire a configuration class.
     * @param configClass the class that represents your configuration
     * @param <T> the class that represents your configuration
     * @return the configuration class requested, if it can be deserialised
     * @throws ConfigurationException if the configuration class cannot be acquired or deserialised
     */
    <T> T getConfiguration(Class<T> configClass)
            throws ConfigurationException;
}
