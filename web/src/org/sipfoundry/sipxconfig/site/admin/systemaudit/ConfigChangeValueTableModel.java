/**
 *
 * Copyright (c) 2013 Karel Electronics Corp. All rights reserved.
 * Contributed to SIPfoundry under a Contributor Agreement
 *
 * This software is free software; you can redistribute it and/or modify it under
 * the terms of the Affero General Public License (AGPL) as published by the
 * Free Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 */

package org.sipfoundry.sipxconfig.site.admin.systemaudit;

import java.util.Iterator;
import java.util.List;

import org.apache.tapestry.contrib.table.model.IBasicTableModel;
import org.apache.tapestry.contrib.table.model.ITableColumn;
import org.sipfoundry.sipxconfig.systemaudit.ConfigChangeValue;

public class ConfigChangeValueTableModel implements IBasicTableModel {

    private List<ConfigChangeValue> m_values;

    public ConfigChangeValueTableModel() {
    }

    public ConfigChangeValueTableModel(List<ConfigChangeValue> values) {
        setValues(values);
    }

    public List<ConfigChangeValue> getValues() {
        return m_values;
    }

    public void setValues(List<ConfigChangeValue> configChange) {
        this.m_values = configChange;
    }

    public int getRowCount() {
        return m_values.size();
    }

    public Iterator<ConfigChangeValue> getCurrentPageRows(int firstRow,
            int pageSize, ITableColumn objSortColumn, boolean orderAscending) {
        return m_values.iterator();
    }

}
