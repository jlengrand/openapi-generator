/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import type { ParentWithNullable } from './ParentWithNullable';
import {
    ParentWithNullableFromJSON,
    ParentWithNullableFromJSONTyped,
    ParentWithNullableToJSON,
} from './ParentWithNullable';

/**
 * 
 * @export
 * @interface ChildWithNullable
 */
export interface ChildWithNullable extends ParentWithNullable {
    /**
     * 
     * @type {string}
     * @memberof ChildWithNullable
     */
    otherProperty?: string;
}



/**
 * Check if a given object implements the ChildWithNullable interface.
 */
export function instanceOfChildWithNullable(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function ChildWithNullableFromJSON(json: any): ChildWithNullable {
    return ChildWithNullableFromJSONTyped(json, false);
}

export function ChildWithNullableFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChildWithNullable {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        ...ParentWithNullableFromJSONTyped(json, ignoreDiscriminator),
        'otherProperty': !exists(json, 'otherProperty') ? undefined : json['otherProperty'],
    };
}

export function ChildWithNullableToJSON(value?: ChildWithNullable | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        ...ParentWithNullableToJSON(value),
        'otherProperty': value.otherProperty,
    };
}

