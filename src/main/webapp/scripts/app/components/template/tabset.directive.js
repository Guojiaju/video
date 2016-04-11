(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/23.
   * auth: xzc
   * 未经允许请勿转载
   */
  angular
    .module('frontTvWeb')
    .directive('tabSet', tabSet);

  /** @ngInject */
  function tabSet() {
    var directive = {
      restrict: 'EA',
      templateUrl: 'app/components/template/tabset.html',
      scope:{
        tabDatas:'=',
        index: '@'
      },
   /*   controller: tabController,
      controllerAs: 'vm',
      bindToController: true,*/
      link: function(scope, element, attrs, ctrl) {
        var i = scope.index;
        var block_layout = angular.element('.block-layout').eq(i);
        block_layout.find('ul li').mouseenter(function(e){
          var index =$(this).index();
          block_layout.find('ul li').removeClass('active-tv');
          $(this).addClass('active-tv');

        });
        }
    };

    return directive;
/*
    function tabController($log,$timeout) {
      var vm = this;
     /!* vm.tabDatas =angular.fromJson(vm.tabData);*!/
  /!*    $timeout(function(){
        console.log(vm.ngModel);
      });
*!/
      // "vm.creation" is avaible by directive option "bindToController: true"
      // vm.relativeDate = moment(vm.liquids).fromNow();
      // console.log(vm.liquids);
    }*/
  }

})();
