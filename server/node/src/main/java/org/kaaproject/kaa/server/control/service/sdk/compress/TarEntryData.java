/**
 *  Copyright 2014-2016 CyberVision, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.kaaproject.kaa.server.control.service.sdk.compress;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

/**
 * The Class TarEntryData.
 */
public class TarEntryData {

    /** The entry. */
    private TarArchiveEntry entry;
    
    /** The data. */
    byte[] data;
    
    /**
     * Instantiates a new zip entry data.
     *
     * @param entry the entry
     * @param data the data
     */
    public TarEntryData(TarArchiveEntry entry, byte[] data) {
        this.entry = entry;
        this.data = data;
    }
    
    /**
     * Gets the entry.
     *
     * @return the entry
     */
    public TarArchiveEntry getEntry() {
        return entry;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    public byte[] getData() {
        return data;
    }

}
