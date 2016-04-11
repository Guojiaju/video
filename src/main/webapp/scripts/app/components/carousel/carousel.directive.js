(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .directive('liquidCarousel', liquidCarousel);

  /** @ngInject */
  function liquidCarousel() {
    var directive = {
      restrict: 'EA',
      templateUrl: 'app/components/carousel/carousel.html',
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

        var liquid =angular.element('.liquid');
        var index =0;
        var height = scope.height +'px';
        var width = scope.width +'px';

        liquid.css({"height":height,"width":width});
        liquid.find('.liquid-content').css({'width':scope.width-100 + 'px','height':height});
        liquid.find('.previous').click(function(){
          index --;
          /*liquid.find('.wrapper ul').css('margin-left','0px');*/
          var rollobj = angular.element('.liquid .wrapper');
          var rollWidth = rollobj.find("li").outerWidth()-20;
          rollWidth = rollWidth * 2;
          if(index > -1) {
            rollobj.stop(true, false).animate({left: -rollWidth * index}, 1000);
          }
        })
        liquid.find('.next').click(function(){
          index ++;
            //liquid.find('.wrapper ul').css('margin-left','-980px');
          var rollobj = angular.element('.liquid .wrapper');
          var rollWidth = rollobj.find("li").outerWidth()+47;
          rollWidth = rollWidth * 2;
          if(index <5){
            rollobj.stop(true,false).animate({left: -rollWidth *index},1000);
          }

        })
      }
    };
    return directive;

  }

})();
