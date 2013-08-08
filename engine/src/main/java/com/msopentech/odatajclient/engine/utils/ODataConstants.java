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
package com.msopentech.odatajclient.engine.utils;

import javax.xml.XMLConstants;

/**
 * Constant values related to the OData protocol.
 */
public class ODataConstants {

    // Other stuff
    public static final String V30 = "3.0";

    public final static String UTF8 = "UTF-8";

    public final static String NAME = "name";

    public final static String TYPE = "type";

    public final static String PROPERTIES = "properties";

    // XML namespaces and prefixes
    public static final String NS_DATASERVICES = "http://schemas.microsoft.com/ado/2007/08/dataservices";

    public static final String NS_METADATA = NS_DATASERVICES + "/metadata";

    public static final String NS_SCHEME = NS_DATASERVICES + "/scheme";

    public static final String NS_GEORSS = "http://www.georss.org/georss";

    public static final String NS_GML = "http://www.opengis.net/gml";

    public static final String XMLNS_DATASERVICES = XMLConstants.XMLNS_ATTRIBUTE + ":d";

    public static final String PREFIX_DATASERVICES = "d:";

    public static final String XMLNS_METADATA = XMLConstants.XMLNS_ATTRIBUTE + ":m";

    public static final String PREFIX_METADATA = "m:";

    public static final String XMLNS_GEORSS = XMLConstants.XMLNS_ATTRIBUTE + ":georss";

    public static final String PREFIX_GEORSS = "georss:";

    public static final String XMLNS_GML = XMLConstants.XMLNS_ATTRIBUTE + ":gml";

    public static final String PREFIX_GML = "gml:";

    public static final String NAVIGATION_LINK_REL = NS_DATASERVICES + "/related/";

    public static final String ASSOCIATION_LINK_REL = NS_DATASERVICES + "/relatedlinks/";

    /**
     * Media edit link rel value.
     */
    public static final String MEDIA_EDIT_LINK_REL = NS_DATASERVICES + "/edit-media/";

    /**
     * Edit link rel value.
     */
    public static final String EDIT_LINK_REL = "edit";

    /**
     * Self link rel value.
     */
    public static final String SELF_LINK_REL = "self";

    public static final String NEXT_LINK_REL = "next";

    // XML elements and attributes
    public static final String ELEM_PROPERTIES = PREFIX_METADATA + PROPERTIES;

    public static final String ELEM_ELEMENT = "element";

    public static final String ELEM_INLINE = PREFIX_METADATA + "inline";

    public static final String ATTR_TYPE = PREFIX_METADATA + TYPE;

    public static final String ATTR_NULL = PREFIX_METADATA + "null";

    public static final String ATTR_XMLBASE = "xml:base";

    public static final String ATTR_HREF = "href";

    public static final String ATTR_METADATA = "metadata";

    public static final String ATTR_TITLE = "title";

    public static final String ATTR_TARGET = "target";

    public static final String ELEM_SERVICE = "service";

    public static final String ELEM_COLLECTION = "collection";

    public static final String ATTR_ATOM_TITLE = "atom:title";

    public static final String ATTR_SRSNAME = PREFIX_GML + "srsName";

    public static final String ELEM_POINT = PREFIX_GML + "Point";

    public static final String ELEM_MULTIPOINT = PREFIX_GML + "MultiPoint";

    public static final String ELEM_POINTMEMBERS = PREFIX_GML + "pointMembers";

    public static final String ELEM_LINESTRING = PREFIX_GML + "LineString";

    public static final String ELEM_MULTILINESTRING = PREFIX_GML + "MultiCurve";

    public static final String ELEM_LINESTRINGMEMBERS = PREFIX_GML + "curveMembers";

    public static final String ELEM_POLYGON = PREFIX_GML + "Polygon";

    public static final String ELEM_POLYGON_EXTERIOR = PREFIX_GML + "exterior";

    public static final String ELEM_POLYGON_INTERIOR = PREFIX_GML + "interior";

    public static final String ELEM_POLYGON_LINEARRING = PREFIX_GML + "LinearRing";

    public static final String ELEM_MULTIPOLYGON = PREFIX_GML + "MultiSurface";

    public static final String ELEM_SURFACEMEMBERS = PREFIX_GML + "surfaceMembers";

    public static final String ELEM_GEOCOLLECTION = PREFIX_GML + "MultiGeometry";

    public static final String ELEM_GEOMEMBERS = PREFIX_GML + "geometryMembers";

    public static final String ELEM_POS = PREFIX_GML + "pos";

    public static final String ELEM_POSLIST = PREFIX_GML + "posList";

    public static final String ELEM_PROPERTY = "property";

    public static final String ELEM_URI = "uri";

    public static final String ELEM_ACTION = PREFIX_METADATA + "action";

    public static final String ELEM_FUNCTION = PREFIX_METADATA + "function";

    // JSON stuff
    public final static String JSON_METADATA = "odata.metadata";

    public final static String JSON_TYPE = "odata.type";

    public final static String JSON_ID = "odata.id";

    public final static String JSON_ETAG = "odata.etag";

    public final static String JSON_READ_LINK = "odata.readLink";

    public final static String JSON_EDIT_LINK = "odata.editLink";

    public final static String JSON_MEDIAREAD_LINK = "odata.mediaReadLink";

    public final static String JSON_MEDIAEDIT_LINK = "odata.mediaEditLink";

    public final static String JSON_MEDIA_CONTENT_TYPE = "odata.mediaContentType";

    public final static String JSON_NAVIGATION_LINK_SUFFIX = "@odata.navigationLinkUrl";

    public final static String JSON_BIND_LINK_SUFFIX = "@odata.bind";

    public final static String JSON_ASSOCIATION_LINK_SUFFIX = "@odata.associationLinkUrl";

    public final static String JSON_MEDIAEDIT_LINK_SUFFIX = "@odata.mediaEditLink";

    public final static String JSON_VALUE = "value";

    public final static String JSON_URL = "url";

    public final static String JSON_COORDINATES = "coordinates";

    public final static String JSON_GEOMETRIES = "geometries";

    public final static String JSON_CRS = "crs";

    public final static String JSON_GIS_URLPREFIX = "http://www.opengis.net/def/crs/EPSG/0/";

}
