/*
 * Copyright 2013 MS OpenTech.
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
package com.msopentech.odatajclient.engine.data;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * OData entity.
 */
public abstract class ODataEntity extends ODataItem {

    private static final long serialVersionUID = 8360640095932811034L;

    /**
     * Atom extensions (optional info).
     */
    private ODataEntityAtomExtensions atomExtensions;

    /**
     * OData entity properties.
     */
    private final List<ODataProperty> properties = new ArrayList<ODataProperty>();

    /**
     * OData entity navigation links.
     */
    private final List<ODataItem> links = new ArrayList<ODataItem>();

    /**
     * OData entity edit link.
     */
    private URI editLink;

    /**
     * Constructor.
     *
     * @param name OData entity name.
     */
    public ODataEntity(final String name) {
        super(name);
    }

    /**
     * Returns OData entity properties.
     *
     * @return OData entity properties.
     */
    public List<ODataProperty> getProperties() {
        return properties;
    }

    /**
     * Adds new property.
     *
     * @param property property to be added.
     */
    public void addProperty(final ODataProperty property) {
        if (!properties.contains(property)) {
            properties.add(property);
        }
    }

    /**
     * Returns OData entity navigation links.
     *
     * @return OData entity navigation links.
     */
    public List<ODataItem> getLinks() {
        return links;
    }

    /**
     * Add a new navigation link.
     *
     * @param entity navigation link to be added.
     */
    public void addLink(final ODataItem entity) {
        if (!links.contains(entity)) {
            links.add(entity);
        }
    }

    /**
     * Gets Atom extensions.
     *
     * @return Atom extensions.
     */
    public ODataEntityAtomExtensions getAtomExtensions() {
        return atomExtensions;
    }

    /**
     * Sets atom extensions (optional).
     *
     * @param atomExtensions Atom extensions to be specified.
     */
    public void setAtomExtensions(ODataEntityAtomExtensions atomExtensions) {
        this.atomExtensions = atomExtensions;
    }

    /**
     * Returns OData entity edit link.
     *
     * @return entity edit link.
     */
    public URI getEditLink() {
        return editLink;
    }

    /**
     * Sets OData entity edit link.
     *
     * @param editLink edit link.
     */
    public void setEditLink(final URI editLink) {
        this.editLink = editLink;
    }

    /**
     * {@inheritDoc }
     * <p>
     * In case of null self link the edit link will be returned.I
     */
    @Override
    public URI getLink() {
        return super.getLink() == null ? getEditLink() : super.getLink();
    }
}
