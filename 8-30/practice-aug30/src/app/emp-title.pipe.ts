import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'empTitle'
})
export class EmpTitlePipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
