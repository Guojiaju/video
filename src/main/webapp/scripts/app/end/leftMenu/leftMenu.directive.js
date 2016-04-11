(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .directive('leftMenu', leftMenu);

  /** @ngInject */
  function leftMenu() {
    var directive = {
      restrict: 'EA',
      templateUrl: 'app/end/leftMenu/leftMenu.html',
      transculde : true,
      replace : true,
      scope: {
          liquids: '=someAttr',
          height : '=',
          width : '=',
          size : '=',
          index : '@'
      },

      link: function(scope, element, attr, ctrl) {
        angular.element('.side-menu li').click(function(event){
         $(this).find("ul").toggleClass('none');
         $(this).toggleClass('active');
        })
      }
    };
    return directive;

  }

})();
