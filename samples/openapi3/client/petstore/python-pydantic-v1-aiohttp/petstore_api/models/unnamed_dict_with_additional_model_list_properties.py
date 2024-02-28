# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Dict, List, Optional
from pydantic import BaseModel, Field, conlist
from petstore_api.models.creature_info import CreatureInfo

class UnnamedDictWithAdditionalModelListProperties(BaseModel):
    """
    UnnamedDictWithAdditionalModelListProperties
    """
    dict_property: Optional[Dict[str, conlist(CreatureInfo)]] = Field(None, alias="dictProperty")
    __properties = ["dictProperty"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> UnnamedDictWithAdditionalModelListProperties:
        """Create an instance of UnnamedDictWithAdditionalModelListProperties from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each value in dict_property (dict of array)
        _field_dict_of_array = {}
        if self.dict_property:
            for _key in self.dict_property:
                if self.dict_property[_key]:
                    _field_dict_of_array[_key] = [
                        _item.to_dict() for _item in self.dict_property[_key]
                    ]
            _dict['dictProperty'] = _field_dict_of_array
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> UnnamedDictWithAdditionalModelListProperties:
        """Create an instance of UnnamedDictWithAdditionalModelListProperties from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return UnnamedDictWithAdditionalModelListProperties.parse_obj(obj)

        _obj = UnnamedDictWithAdditionalModelListProperties.parse_obj({
            "dict_property": dict(
                (_k,
                        [CreatureInfo.from_dict(_item) for _item in _v]
                        if _v is not None
                        else None
                )
                for _k, _v in obj.get("dictProperty").items()
            )
        })
        return _obj


