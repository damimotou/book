window.onload = function(){

   function fade(elem, t, f, callback){
      // кадров в секунду (по умолчанию 50)
      var fps = f || 50; 
      // время работы анимации (по умолчанию 500мс)
      var time = t || 500; 
      // сколько всего покажем кадров
      var steps = time / fps;   
      
     var func = callback || function(){}; 
      
      // текущее значение opacity - изначально 0
      var op = 1;
      // изменение прозрачности за 1 кадр
      var d0 = op / steps;
      
      // устанавливаем интервал (1000 / fps) 
      // например, 50fps -> 1000 / 50 = 20мс  
      var timer = setInterval(function(){
            // уменьшаем текущее значение opacity
            op -= d0;
            // устанавливаем opacity элементу DOM
            elem.style.opacity = op;
            // уменьшаем количество оставшихся шагов анимации
            steps--;
            
            // если анимация окончена
            if(steps == 0){
              // убираем интервал выполнения
              clearInterval(timer);
              // и убираем элемент из потока документа
              elem.style.display = 'none';
              func();
            }
        }, (1000 / fps));
   }
   
   var elem = document.querySelector('.button');
   fade(elem, 2000, 50, function(){
        console.log('скрыты кнопки');
        fade(elem1, 3000, 50, function(){
        console.log('скрыт слайдер');
       });
   });

   var elem1 = document.querySelector('.slider');
   



   
}
