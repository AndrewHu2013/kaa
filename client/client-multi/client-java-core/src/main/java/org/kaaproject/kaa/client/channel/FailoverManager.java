/*
 * Copyright 2014-2015 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.client.channel;

/**
 * Manager is responsible for managing current server's fail/connection events
 */
public interface FailoverManager {

    /**
     * Needs to be invoked when a server fail occurs.
     *
     * @param connectionInfo
     *                       the connection information of the failed server.
     *
     * @see org.kaaproject.kaa.client.channel.TransportConnectionInfo
     */
    void onServerFailed(TransportConnectionInfo connectionInfo);

    /**
     * Needs to be invoked just before current server is changed.
     *
     * @param oldConnectionInfo
     *                          the connection information of the current server.
     *
     * @see org.kaaproject.kaa.client.channel.TransportConnectionInfo
     */
    void onServerChanged(TransportConnectionInfo oldConnectionInfo);

    /**
     * Needs to be invoked as soon as connection to a server is established.
     *
     * @param connectionInfo
     *                       the connection information of the current server,
     *                       to which connection was successfully established.
     *
     * @see org.kaaproject.kaa.client.channel.TransportConnectionInfo
     */
    void onServerConnected(TransportConnectionInfo connectionInfo);
}
