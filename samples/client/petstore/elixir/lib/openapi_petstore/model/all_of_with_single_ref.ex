# NOTE: This file is auto generated by OpenAPI Generator 6.3.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.AllOfWithSingleRef do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :username,
    :SingleRefType
  ]

  @type t :: %__MODULE__{
    :username => String.t | nil,
    :SingleRefType => any() | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.AllOfWithSingleRef do
  def decode(value, _options) do
    value
  end
end

