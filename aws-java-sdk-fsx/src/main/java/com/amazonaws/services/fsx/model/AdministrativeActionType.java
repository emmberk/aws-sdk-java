/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * Describes the type of administrative action, as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative action initiated by the user from the Amazon
 * FSx console, API (UpdateFileSystem), or CLI (update-file-system). A
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>STORAGE_OPTIMIZATION</code> - Once the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage
 * capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task starts. Storage optimization is the process
 * of migrating the file system data to the new, larger disks. You can track the storage migration progress using the
 * <code>ProgressPercent</code> property. When <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent
 * <code>FILE_SYSTEM_UPDATE</code> action status changes to <code>COMPLETED</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
 * Capacity</a>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AdministrativeActionType {

    FILE_SYSTEM_UPDATE("FILE_SYSTEM_UPDATE"),
    STORAGE_OPTIMIZATION("STORAGE_OPTIMIZATION");

    private String value;

    private AdministrativeActionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return AdministrativeActionType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AdministrativeActionType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AdministrativeActionType enumEntry : AdministrativeActionType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
