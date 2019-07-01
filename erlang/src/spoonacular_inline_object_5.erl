-module(spoonacular_inline_object_5).

-export([encode/1]).

-export_type([spoonacular_inline_object_5/0]).

-type spoonacular_inline_object_5() ::
    #{ 'title' := binary(),
       'ingredientList' := binary()
     }.

encode(#{ 'title' := Title,
          'ingredientList' := IngredientList
        }) ->
    #{ 'title' => Title,
       'ingredientList' => IngredientList
     }.
