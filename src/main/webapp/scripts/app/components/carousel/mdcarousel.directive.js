(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .directive('mdCarousel', mdCarousel);

  /** @ngInject */
  function mdCarousel() {
    var directive = {
      restrict: 'EA',
      templateUrl: 'app/components/carousel/mdcarousel.html',
      transculde : true,
      replace : true,
      scope: {
          movies: '=someAttr',
          index : '@'
      },

      link: function(scope, element, attr, ctrl) {

        var movie =angular.element('.movie_directive').eq(scope.index);
        var index =0;
        movie.find('.previous').click(function(){
          index --;
          /*liquid.find('.wrapper ul').css('margin-left','0px');*/
          var rollobj = movie.find(".wrapper");
          var rollWidth = rollobj.find("li").outerWidth()+5;
          rollWidth = rollWidth * 2;
          if(index > -1) {
            rollobj.stop(true, false).animate({left: -rollWidth * index}, 1000);
          }
        })
        movie.find('.next').click(function(){
          index ++;
            //liquid.find('.wrapper ul').css('margin-left','-980px');
          var rollobj =movie.find('.wrapper');
          var rollWidth = rollobj.find("li").outerWidth()+120;
          rollWidth = rollWidth * 2;
          if(index <4){
            rollobj.stop(true,false).animate({left: -rollWidth *index},1000);
          }

        })
      }
    };
    return directive;

/*    function liquidController(MainService, $log) {
      var vm = this;
      console.log(vm.size);
      //console.log(JSON.parse(vm.liquids));
      // "vm.creation" is avaible by directive option "bindToController: true"
     // vm.relativeDate = moment(vm.liquids).fromNow();
     // console.log(vm.liquids);
    }*/
  }

})();
