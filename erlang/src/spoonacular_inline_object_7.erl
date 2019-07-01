-module(spoonacular_inline_object_7).

-export([encode/1]).

-export_type([spoonacular_inline_object_7/0]).

-type spoonacular_inline_object_7() ::
    #{ 'ingredientList' := binary(),
       'servings' := integer(),
       'measure' => binary(),
       'view' => binary(),
       'defaultCss' => boolean(),
       'showBacklink' => boolean()
     }.

encode(#{ 'ingredientList' := IngredientList,
          'servings' := Servings,
          'measure' := Measure,
          'view' := View,
          'defaultCss' := DefaultCss,
          'showBacklink' := ShowBacklink
        }) ->
    #{ 'ingredientList' => IngredientList,
       'servings' => Servings,
       'measure' => Measure,
       'view' => View,
       'defaultCss' => DefaultCss,
       'showBacklink' => ShowBacklink
     }.
